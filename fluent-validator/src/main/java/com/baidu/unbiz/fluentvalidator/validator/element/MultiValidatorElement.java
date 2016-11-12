package com.baidu.unbiz.fluentvalidator.validator.element;

import java.util.List;

import com.baidu.unbiz.fluentvalidator.able.Listable;
import com.baidu.unbiz.fluentvalidator.util.CollectionUtil;

/**
 * 一个对象上进行多个验证器验证的元素
 *
 * @author zhangxu
 * @see ValidatorElementComposite
 */
public class MultiValidatorElement extends ValidatorElementComposite implements Listable<ValidatorElement> {

    public MultiValidatorElement(List<ValidatorElement> validatorElements) {
        super(validatorElements);
    }

    @Override
    public String toString() {
        if (CollectionUtil.isEmpty(validatorElements)) {
            return "[]";
        }
        return validatorElements.toString();
    }

}
