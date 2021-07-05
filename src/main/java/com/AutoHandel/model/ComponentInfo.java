package com.AutoHandel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ComponentInfo {
    private Component component;
    private Boolean isUnbroken;


    @Override
    public String toString() {
        return "ComponentInfo{" +
                "component=" + component +
                ", isUnbroken=" + isUnbroken +
                '}';
    }
}


