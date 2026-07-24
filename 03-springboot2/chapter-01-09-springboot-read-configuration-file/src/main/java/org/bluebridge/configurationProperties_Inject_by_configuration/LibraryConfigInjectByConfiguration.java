package org.bluebridge.configurationProperties_Inject_by_configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 使用 @Configuration 注入的图书馆配置类
 *
 * @author lingwh
 * @date 2019/11/19 13:42
 */
@ConfigurationProperties(prefix = "library")
@Configuration  //一般用来声明配置类，可以使用@Component 注解替代，不过使用@Configuration 注解声明配置类更加语义
public class LibraryConfigInjectByConfiguration {

    private String location;
    private List<Book> books;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    static class Book {

        private String name;
        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "location='" + location + '\'' +
                ", books=" + books +
                '}';
    }
}
