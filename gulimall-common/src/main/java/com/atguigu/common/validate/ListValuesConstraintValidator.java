package com.atguigu.common.validate;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValuesConstraintValidator implements ConstraintValidator<ListValues,Integer> {
    private Set<Integer> set = new HashSet<Integer>();
    /**
     * 初始化方法，他会将注解的详细信息vals、message拿到
     * @param constraintAnnotation
     */
    @Override
    public void initialize(ListValues constraintAnnotation) {
        int[] vals = constraintAnnotation.value();
        if(vals != null || vals.length>0){
            for (int val : vals) {
                set.add( val );
            }
        }
    }

    /**
     * 判断是否校验成功
     * @param value 需要校验的值，也就是我们前台传过来的值
     * @param context
     * @return
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
