package com.vmware.vim25;

import com.vmware.vim25.CustomFieldEvent;
import com.vmware.vim25.CustomFieldValueChangedEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldValueChangedEvent", propOrder = {"entity", "fieldKey", "name", "value", "prevState"})
public class CustomFieldValueChangedEvent extends CustomFieldEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  protected int fieldKey;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String value;
  
  protected String prevState;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public int getFieldKey() {
    return this.fieldKey;
  }
  
  public void setFieldKey(int paramInt) {
    this.fieldKey = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
  
  public String getPrevState() {
    return this.prevState;
  }
  
  public void setPrevState(String paramString) {
    this.prevState = paramString;
  }
}
