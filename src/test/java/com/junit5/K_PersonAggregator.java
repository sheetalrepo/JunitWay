package com.junit5;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

public class K_PersonAggregator implements ArgumentsAggregator {

	@Override
	public Object aggregateArguments(ArgumentsAccessor arg, ParameterContext context)
			throws ArgumentsAggregationException {
		return new K_Person(arg.getString(0), arg.getInteger(1), arg.getString(2));
	}

}
