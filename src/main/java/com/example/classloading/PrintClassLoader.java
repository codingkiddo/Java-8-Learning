package com.example.classloading;

import java.util.ArrayList;

import com.sun.javafx.util.Logging;

public class PrintClassLoader {

	public static void main(String[] args) {
		new PrintClassLoader().printClassLoaders();
	}

	public void printClassLoaders() {
		System.out.println();
		System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader());
		System.out.println("Classloader of this class:" + PrintClassLoader.class.getClassLoader().getParent());
		System.out.println("Classloader of Logging:" + Logging.class.getClassLoader());
        System.out.println("Classloader of Logging:" + Logging.class.getClassLoader().getParent());
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader().getParent());
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());
	}
}
