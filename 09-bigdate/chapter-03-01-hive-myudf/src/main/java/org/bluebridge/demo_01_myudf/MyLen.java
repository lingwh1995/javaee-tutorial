package org.bluebridge.demo_01_myudf;

import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentLengthException;
import org.apache.hadoop.hive.ql.exec.UDFArgumentTypeException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

/**
 * 自定义计算字符串长度的 hive 函数
 *
 * @author lingwh
 * @date 2026/9/30 17:03
 */
public class MyLen extends GenericUDF {

    /*
     * 初始化方法（做一些校验工作）
     * */
    @Override
    public ObjectInspector initialize(ObjectInspector[] arguments) throws UDFArgumentException {
        // 1. 对参数列表进行非空检验
        if(arguments == null || arguments.length != 1){
            // 进行异常捕获
            throw new UDFArgumentLengthException("参数不能为null,或者参数个数不为1");
        }

        // 2.校验参数的数据类型
        ObjectInspector argument = arguments[0];
        if(!ObjectInspector.Category.PRIMITIVE.equals(argument.getCategory())){
            throw new UDFArgumentTypeException(0, "参数类型不是基本数据数据类型");
        }

        // 3. 校验参数是否为字符串类型
        PrimitiveObjectInspector argument1 = (PrimitiveObjectInspector) arguments[0];

        if(!argument1.getPrimitiveCategory().equals(PrimitiveObjectInspector.PrimitiveCategory.STRING)){
            throw new UDFArgumentTypeException(0, "参数类型不是String");
        }

        return PrimitiveObjectInspectorFactory.javaIntObjectInspector;
    }

    /*
     * 核心逻辑处理方法
     * */
    @Override
    public Object evaluate(DeferredObject[] arguments) throws HiveException {
        // 获取输入的参数
        DeferredObject argument = arguments[0];
        if(argument.get() == null){
            return 0;
        }
        return argument.get().toString().length();
    }

    /*
     * 当前函数的描述信息
     * */
    @Override
    public String getDisplayString(String[] children) {
        return null;
    }

}