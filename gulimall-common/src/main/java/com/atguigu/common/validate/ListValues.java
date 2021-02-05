package com.atguigu.common.validate;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 自定义校验注解
 *
 * 参数说明:
 *
 * @Target 用于标识这个注解能写在那些地方(类、方法、构造等)
 * @Retention 用于标识运行时机
 * @Constraint 用于指定那个校验器进行校验
 * @Repeatable 可重复注解
 * @Documented 它会被 javadoc 之类的工具处理, 所以注解类型信息也会被包括在生成的文档中，是一个标记注解，没有成员。
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ListValuesConstraintValidator.class})
public @interface ListValues {

    //校验时返回的错误信息
    //出现错误，错误信息去哪里取(去ValidationMessages.properties这个配置文件中取错误信息).
    String message() default "{com.atguigu.common.validate.ListValues.message}";

    //校验时的分组注解名
    Class<?>[] groups() default { };

    //校验时的负载信息,自定义一些负载信息
    Class<? extends Payload>[] payload() default { };

    //包含指定值的校验
    int[] value() default {};
}
