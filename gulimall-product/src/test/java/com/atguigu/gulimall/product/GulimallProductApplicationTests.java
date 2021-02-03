package com.atguigu.gulimall.product;


//import com.aliyun.oss.OSS;
//import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setDescript("哈哈1哈");
		brandEntity.setName("诺安成长混合");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

	@Test
	void contextLoads1() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setDescript("修改");
		brandService.updateById(brandEntity);
	}



	/**
	 * 测试上传文件
	 */
	@Test
	public void upload() throws FileNotFoundException {
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "http://oss-cn-beijing.aliyuncs.com";
//		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//		String accessKeyId = "*****";
//		String accessKeySecret = "******";
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//		// 上传文件流。
//		InputStream inputStream = new FileInputStream("C:\\Users\\sunsq\\Desktop\\张伟.jpg");
//		ossClient.putObject("gulimall-ssq", "丸255154伟.jpg", inputStream);
//
//		// 关闭OSSClient。
//		ossClient.shutdown();
//		System.out.println("上传完成!");



	}

}
