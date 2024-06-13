package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppPropertyInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppPropertyInfo", propOrder = {"key", "classId", "instanceId", "id", "category", "label", "type", "typeReference", "userConfigurable", "defaultValue", "value", "description"})
public class VAppPropertyInfo extends DynamicData {
  protected int key;
  
  protected String classId;
  
  protected String instanceId;
  
  protected String id;
  
  protected String category;
  
  protected String label;
  
  protected String type;
  
  protected String typeReference;
  
  protected Boolean userConfigurable;
  
  protected String defaultValue;
  
  protected String value;
  
  protected String description;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getClassId() {
    return this.classId;
  }
  
  public void setClassId(String paramString) {
    this.classId = paramString;
  }
  
  public String getInstanceId() {
    return this.instanceId;
  }
  
  public void setInstanceId(String paramString) {
    this.instanceId = paramString;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getCategory() {
    return this.category;
  }
  
  public void setCategory(String paramString) {
    this.category = paramString;
  }
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getTypeReference() {
    return this.typeReference;
  }
  
  public void setTypeReference(String paramString) {
    this.typeReference = paramString;
  }
  
  public Boolean isUserConfigurable() {
    return this.userConfigurable;
  }
  
  public void setUserConfigurable(Boolean paramBoolean) {
    this.userConfigurable = paramBoolean;
  }
  
  public String getDefaultValue() {
    return this.defaultValue;
  }
  
  public void setDefaultValue(String paramString) {
    this.defaultValue = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
