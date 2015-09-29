package org.developerworld.frameworks.lucene.impl.collection;

import java.util.Map;

import org.apache.lucene.index.Term;
import org.developerworld.frameworks.lucene.TermBuilder;

/**
 * Map标识创建器
 * 
 * @author Roy Huang
 * @version 20120907
 * 
 */
public class MapTermBuilder implements TermBuilder<Map<String, String>> {

	private String key;

	public MapTermBuilder(String key) {
		this.key = key;
	}

	public Term buildTerm(Map<String, String> data) {
		return new Term(key, data.get(key));
	}

}
