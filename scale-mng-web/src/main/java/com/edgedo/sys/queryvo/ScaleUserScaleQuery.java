package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class ScaleUserScaleQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private ScaleUserScaleView queryObj = new ScaleUserScaleView();

	public ScaleUserScaleView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(ScaleUserScaleView queryObj) {
		this.queryObj = queryObj;
	}
}
