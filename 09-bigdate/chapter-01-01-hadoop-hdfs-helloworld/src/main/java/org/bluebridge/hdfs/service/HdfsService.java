package org.bluebridge.hdfs.service;

import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * HDFS 常用操作服务
 */
@Service
public class HdfsService {

    @Autowired
    private FileSystem fileSystem;

    /**
     * 创建目录
     */
    public void mkdir(String path) throws IOException {
        fileSystem.mkdirs(new Path(path));
    }

    /**
     * 上传本地文件到 HDFS
     */
    public void uploadFile(String srcPath, String dstPath) throws IOException {
        fileSystem.copyFromLocalFile(new Path(srcPath), new Path(dstPath));
    }

    /**
     * 通过输入流上传文件到 HDFS
     */
    public void uploadFile(InputStream inputStream, String dstPath) throws IOException {
        FSDataOutputStream outputStream = fileSystem.create(new Path(dstPath), true);
        IOUtils.copyBytes(inputStream, outputStream, 4096, true);
    }

    /**
     * 下载 HDFS 文件到本地
     */
    public void downloadFile(String srcPath, String localDstPath) throws IOException {
        fileSystem.copyToLocalFile(new Path(srcPath), new Path(localDstPath));
    }

    /**
     * 下载 HDFS 文件到输出流
     */
    public void downloadFile(String srcPath, OutputStream outputStream) throws IOException {
        FSDataInputStream inputStream = fileSystem.open(new Path(srcPath));
        IOUtils.copyBytes(inputStream, outputStream, 4096, true);
    }

    /**
     * 删除文件或目录
     *
     * @param recursive 是否递归删除
     */
    public boolean delete(String path, boolean recursive) throws IOException {
        return fileSystem.delete(new Path(path), recursive);
    }

    /**
     * 判断文件或目录是否存在
     */
    public boolean exists(String path) throws IOException {
        return fileSystem.exists(new Path(path));
    }

    /**
     * 重命名文件或目录
     */
    public void rename(String srcPath, String dstPath) throws IOException {
        fileSystem.rename(new Path(srcPath), new Path(dstPath));
    }

    /**
     * 在 HDFS 内部复制文件或目录
     */
    public void copy(String srcPath, String dstPath) throws IOException {
        FileUtil.copy(fileSystem, new Path(srcPath), fileSystem, new Path(dstPath), false, fileSystem.getConf());
    }

    /**
     * 列出目录下文件和目录信息
     */
    public List<FileStatus> listFiles(String path) throws IOException {
        FileStatus[] fileStatuses = fileSystem.listStatus(new Path(path));
        List<FileStatus> result = new ArrayList<>();
        if (fileStatuses != null) {
            for (FileStatus fileStatus : fileStatuses) {
                result.add(fileStatus);
            }
        }
        return result;
    }

    /**
     * 获取文件或目录状态
     */
    public FileStatus getFileStatus(String path) throws IOException {
        return fileSystem.getFileStatus(new Path(path));
    }

    /**
     * 读取 HDFS 文件内容为字符串
     */
    public String readFile(String path) throws IOException {
        FSDataInputStream inputStream = fileSystem.open(new Path(path));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOUtils.copyBytes(inputStream, outputStream, 4096, true);
        return outputStream.toString(StandardCharsets.UTF_8.name());
    }

    /**
     * 将字符串内容写入 HDFS 文件
     */
    public void writeFile(String path, String content) throws IOException {
        try (FSDataOutputStream outputStream = fileSystem.create(new Path(path), true)) {
            outputStream.write(content.getBytes(StandardCharsets.UTF_8));
        }
    }
}
