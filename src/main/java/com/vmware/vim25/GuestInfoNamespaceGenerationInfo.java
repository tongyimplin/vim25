package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestInfoNamespaceGenerationInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestInfoNamespaceGenerationInfo", propOrder = {"key", "generationNo"})
public class GuestInfoNamespaceGenerationInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected int generationNo;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getGenerationNo() {
    return this.generationNo;
  }
  
  public void setGenerationNo(int paramInt) {
    this.generationNo = paramInt;
  }
}
