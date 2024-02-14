package top.shuzz.spring.mylibrary.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 文件存储配置
 * @author heng
 * @since 2024/2/13
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "file-storage-config")
public class FileStorageConfig {

    /**
     * 临时存储目录
     */
    private String tempDir = "";

    /**
     * 书目文件存储根目录
     */
    private String bookFileStorageDir = "";
    /**
     * 封面文件存储根目录
     */
    private String coverFileStorageDir = "";
}
