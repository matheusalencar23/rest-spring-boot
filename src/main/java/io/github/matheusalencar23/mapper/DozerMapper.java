package io.github.matheusalencar23.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
	
	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	public static <S, T> T parseObject(S source, Class<T> target) {
		return mapper.map(source, target);
	}
	
	public static <S, T> List<T> parseListObject(List<S> sourceList, Class<T> target) {
		List<T> targetList = new ArrayList<>();
		for (S source : sourceList) {
			targetList.add(mapper.map(source, target));
		}
		return targetList;
	}
}
