package com.example.thread;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class ProcessorInfoExample1 {
	public static void main(String... args) {
		
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();

        System.out.println(processor.toString());
        
        
        Class<ProcessorInfoExample1> cls = ProcessorInfoExample1.class;
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getGenericSuperclass());
    }

}
