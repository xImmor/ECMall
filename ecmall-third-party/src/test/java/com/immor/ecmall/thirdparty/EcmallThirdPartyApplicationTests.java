package com.immor.ecmall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class EcmallThirdPartyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testUpload() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4G84qZQqeVzgmeWP3wLe";
        String accessKeySecret = "wBy1Rw5sD6Ujk4Angqn2WFumbXGuDf";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\immor\\Desktop\\wq.jpg");
        ossClient.putObject("ecmall-immor", "dddd.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
    }

}
