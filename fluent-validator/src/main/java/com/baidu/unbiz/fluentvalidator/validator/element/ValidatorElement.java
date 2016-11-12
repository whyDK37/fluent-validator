package com.baidu.unbiz.fluentvalidator.validator.element;

import java.util.Arrays;
import java.util.List;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.able.Listable;
import com.baidu.unbiz.fluentvalidator.able.ToStringable;

/**
 * 在{@link FluentValidator}内部调用使用的验证器链包装类
 *
 * @author zhangxu
 */
public class ValidatorElement implements Listable<ValidatorElement> {

    /**
     * 验证器
     */
    private Validator validator;

    /**
     * 待验证对象
     */
    private Object target;

    /**
     * 自定义的打印信息回调
     */
    private ToStringable customizedToString;

    /**
     * create
     *
     * @param target    待验证对象
     * @param validator 验证器
     */
    public ValidatorElement(Object target, Validator validator) {
        this.target = target;
        this.validator = validator;
    }

    /**
     * create
     *
     * @param target             待验证对象
     * @param validator          验证器
     * @param customizedToString 自定义的打印信息回调
     */
    public ValidatorElement(Object target, Validator validator,
                            ToStringable customizedToString) {
        this.target = target;
        this.validator = validator;
        this.customizedToString = customizedToString;
    }

    public Object getTarget() {
        return target;
    }

    public Validator getValidator() {
        return validator;
    }

    @Override
    public List<ValidatorElement> getAsList() {
        return Arrays.asList(this);
    }

    @Override
    public String toString() {
        if (customizedToString != null) {
            return customizedToString.toString();
        }
        return String.format("%s@%s", target == null ? "null" : target.getClass().getSimpleName(), validator);
    }

}
