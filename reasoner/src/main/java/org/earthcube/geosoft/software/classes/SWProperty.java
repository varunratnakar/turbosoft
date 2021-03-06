package org.earthcube.geosoft.software.classes;

import java.util.ArrayList;

public class SWProperty {
  String id;
  String label;
  boolean isObjectProperty;
  String range;
  ArrayList<String> possibleValues;
  ArrayList<String> parentIds;
  String comment;

  public SWProperty(String id, String label) {
    this.id = id;
    this.label = label;
    possibleValues = new ArrayList<String>();
    parentIds = new ArrayList<String>();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ArrayList<String> getParentIds() {
    return parentIds;
  }

  public void addParentId(String parentId) {
    this.parentIds.add(parentId);
  }

  public String getRange() {
    return range;
  }

  public void setRange(String range) {
    this.range = range;
  }

  public boolean isObjectProperty() {
    return isObjectProperty;
  }

  public void setObjectProperty(boolean isObjectProperty) {
    this.isObjectProperty = isObjectProperty;
  }

  public ArrayList<String> getPossibleValues() {
    return possibleValues;
  }

  public void addPossibleValue(String value) {
    this.possibleValues.add(value);
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
}
