/*
 * Copyright 2012 Rui Afonso
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.googlecode.gwt.charts.client.corechart;

import com.google.gwt.core.client.JavaScriptObject;

import com.googlecode.gwt.charts.client.options.CurveType;

public class LineChartSeries extends JavaScriptObject {
	/**
	 * Default constructor
	 * 
	 * @return a new object instance
	 */
	public static LineChartSeries create() {
		return createObject().cast();
	}

	protected LineChartSeries() {
	}

	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	public final void setCurveType(CurveType curveType) {
		setCurveType(curveType.getName());
	}

	public final native void setLineWidth(int width) /*-{
		this.lineWidth = width;
	}-*/;

	public final native void setPointSize(int size) /*-{
		this.pointSize = size;
	}-*/;

	public final native void setTargetAxisIndex(int series, int index) /*-{
		this.targetAxisIndex = index;
	}-*/;

	public final native void setVisibleInLegend(boolean visibleInLegend) /*-{
		this.visibleInLegend = visibleInLegend;
	}-*/;

	private final native void setCurveType(String curveType) /*-{
		this.curveType = curveType;
	}-*/;
}
