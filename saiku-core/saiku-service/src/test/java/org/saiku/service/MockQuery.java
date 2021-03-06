/*
 * Copyright 2014 OSBI Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.saiku.service;

import org.saiku.olap.dto.SaikuCube;
import org.saiku.olap.dto.SaikuTag;
import org.saiku.olap.dto.filter.SaikuFilter;
import org.saiku.olap.query.IQuery;
import org.saiku.olap.util.exception.SaikuOlapException;
import org.saiku.olap.util.formatter.ICellSetFormatter;

import org.jetbrains.annotations.Nullable;
import org.olap4j.*;
import org.olap4j.metadata.Cube;
import org.olap4j.query.QueryAxis;
import org.olap4j.query.QueryDimension;

import java.util.Map;
import java.util.Properties;

/**
 * A class for mocking the query.
 */
public class MockQuery implements IQuery {

  private final String name;

  public MockQuery(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Nullable
  public SaikuCube getSaikuCube() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public CellSet execute() throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public String getMdx() {
    // TODO Auto-generated method stub
    return null;
  }

  public void resetQuery() {
    // TODO Auto-generated method stub

  }

  public void setProperties(Properties props) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public Properties getProperties() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public String toXml() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public Boolean isDrillThroughEnabled() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public QueryType getType() {
    // TODO Auto-generated method stub
    return null;
  }

  public void swapAxes() {
    // TODO Auto-generated method stub

  }

  @Nullable
  public Map<Axis, QueryAxis> getAxes() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public QueryAxis getAxis(Axis axis) {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public QueryAxis getAxis(String name) throws SaikuOlapException {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public Cube getCube() {
    // TODO Auto-generated method stub
    return null;
  }

  @Nullable
  public QueryAxis getUnusedAxis() {
    // TODO Auto-generated method stub
    return null;
  }

  public void moveDimension(QueryDimension dimension, Axis axis) {
    // TODO Auto-generated method stub

  }

  public void moveDimension(QueryDimension dimension, Axis axis, int position) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public QueryDimension getDimension(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  public void resetAxisSelections(QueryAxis axis) {
    // TODO Auto-generated method stub

  }

  public void clearAllQuerySelections() {
    // TODO Auto-generated method stub

  }

  public void setMdx(String mdx) {
    // TODO Auto-generated method stub

  }

  public void setScenario(Scenario scenario) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public Scenario getScenario() {
    // TODO Auto-generated method stub
    return null;
  }

  public void setTag(SaikuTag tag) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public SaikuTag getTag() {
    // TODO Auto-generated method stub
    return null;
  }

  public void removeTag() {
    // TODO Auto-generated method stub

  }

  public void storeCellset(CellSet cs) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public CellSet getCellset() {
    // TODO Auto-generated method stub
    return null;
  }

  public void setStatement(OlapStatement os) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public OlapStatement getStatement() {
    // TODO Auto-generated method stub
    return null;
  }

  public void cancel() throws Exception {
    // TODO Auto-generated method stub

  }

  public void clearAxis(String axisName) throws SaikuOlapException {
    // TODO Auto-generated method stub

  }

  public void setFilter(SaikuFilter filter) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public SaikuFilter getFilter() {
    // TODO Auto-generated method stub
    return null;
  }

  public void removeFilter() {
    // TODO Auto-generated method stub

  }

  @Nullable
  public OlapConnection getConnection() {
    // TODO Auto-generated method stub
    return null;
  }

  public void storeFormatter(ICellSetFormatter formatter) {
    // TODO Auto-generated method stub

  }

  @Nullable
  public ICellSetFormatter getFormatter() {
    // TODO Auto-generated method stub
    return null;
  }

  public void setTotalFunction(String uniqueLevelName, String value) {

  }

  @Nullable
  public String getTotalFunction(String uniqueLevelName) {
    return null;
  }

  @Nullable
  public Map<String, String> getTotalFunctions() {
    return null;
  }

}
