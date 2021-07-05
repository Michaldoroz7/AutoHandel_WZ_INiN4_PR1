package com.AutoHandel.service;

import com.AutoHandel.model.Component;
import com.AutoHandel.model.ComponentInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ComponentInfoListGenerator {

    public static List<ComponentInfo> generate() {
        List<ComponentInfo> componentInfoList = new ArrayList<>();
        Arrays.stream(Component.values()).forEach(a -> componentInfoList.add(new ComponentInfo(a, generateBoolean())));
        return componentInfoList;
    }

    private static Boolean generateBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }



}
