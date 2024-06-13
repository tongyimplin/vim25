package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VslmTagEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmTagEntry", propOrder = {"tagName", "parentCategoryName"})
public class VslmTagEntry extends DynamicData {
  @XmlElement(required = true)
  protected String tagName;
  
  @XmlElement(required = true)
  protected String parentCategoryName;
  
  public String getTagName() {
    return this.tagName;
  }
  
  public void setTagName(String paramString) {
    this.tagName = paramString;
  }
  
  public String getParentCategoryName() {
    return this.parentCategoryName;
  }
  
  public void setParentCategoryName(String paramString) {
    this.parentCategoryName = paramString;
  }
}
