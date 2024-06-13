package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.Tag;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tag", propOrder = {"key"})
public class Tag extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
