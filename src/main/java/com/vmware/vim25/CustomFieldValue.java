package com.vmware.vim25;

import com.vmware.vim25.CustomFieldStringValue;
import com.vmware.vim25.CustomFieldValue;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldValue", propOrder = {"key"})
@XmlSeeAlso({CustomFieldStringValue.class})
public class CustomFieldValue extends DynamicData {
  protected int key;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
}
