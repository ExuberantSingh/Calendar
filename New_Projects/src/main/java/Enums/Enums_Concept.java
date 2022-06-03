package Enums;

import java.util.EnumSet;
import java.util.Iterator;

public class Enums_Concept {

	
	
	//it is not synchronized 
	//it is highly performance java collection
	//it is actually faster than Hashset 
	//all the methods are implemented using bitwise arithmetic operations
	
	enum Lang{
		JAVA,
		CSharp,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}
	
	
	public static void main(String[] args) {
	
	EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
	System.out.println(langs);
	
	EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
	System.out.println(l);
	
	EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.PYTHON);
	System.out.println(enumRange);
	
	EnumSet<Lang> ruby =  EnumSet.of(Lang.RUBY);
	System.out.println(ruby);
	 
	EnumSet<Lang> multi = EnumSet.of(Lang.RUBY, Lang.CSharp); 
	System.out.println(multi);
	
	EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
	EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
	
	lang2.add(Lang.JAVASCRIPT);
	lang2.addAll(lang1);
	System.out.println(lang2);
	
	
	EnumSet<Lang>  fullLang = EnumSet.allOf(Lang.class);
	Iterator<Lang> it = fullLang.iterator();
	
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	 
	
	
	
	}

}
