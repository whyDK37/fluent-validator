package com.baidu.unbiz.fluentvalidator.validator.element;

import java.util.List;

import com.baidu.unbiz.fluentvalidator.able.Listable;
import com.baidu.unbiz.fluentvalidator.util.CollectionUtil;

/**
 * 集合或者列表、数组使用一个验证器验证时候的可遍历元素
 *
 * @author zhangxu
 * @see ValidatorElementComposite
 */
public class IterableValidatorElement extends ValidatorElementComposite implements Listable<ValidatorElement> {

    public IterableValidatorElement(List<ValidatorElement> validatorElements) {
        super(validatorElements);
    }

    @Override
    public String toString() {
        if (CollectionUtil.isEmpty(validatorElements)) {
            return "Empty iterable validator elements";
        }
        return String.format("Total %d of %s", size(), validatorElements.get(0));
    }

}
