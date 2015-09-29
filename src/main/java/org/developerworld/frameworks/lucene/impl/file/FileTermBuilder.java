package org.developerworld.frameworks.lucene.impl.file;

import java.io.File;

import org.apache.lucene.index.Term;
import org.developerworld.frameworks.lucene.TermBuilder;

/**
 * 文件标识创建器
 * @author Roy Huang
 * @version 2012907
 *
 */
public class FileTermBuilder implements TermBuilder<File> {

	public Term buildTerm(File data) {
		return new Term("path", data.getPath());
	}

}
