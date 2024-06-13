package com.vmware.vim25;

import com.vmware.vim25.Description;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.ExtendedDescription;
import com.vmware.vim25.MethodDescription;
import com.vmware.vim25.TypeDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Description", propOrder = {"label", "summary"})
@XmlSeeAlso({TypeDescription.class, MethodDescription.class, ExtendedDescription.class, ElementDescription.class})
public class Description extends DynamicData {
  @XmlElement(required = true)
  protected String label;
  
  @XmlElement(required = true)
  protected String summary;
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public String getSummary() {
    return this.summary;
  }
  
  public void setSummary(String paramString) {
    this.summary = paramString;
  }
}
