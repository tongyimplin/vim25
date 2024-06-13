package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ScsiLunDescriptor;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLunDescriptor", propOrder = {"quality", "id"})
public class ScsiLunDescriptor extends DynamicData {
  @XmlElement(required = true)
  protected String quality;
  
  @XmlElement(required = true)
  protected String id;
  
  public String getQuality() {
    return this.quality;
  }
  
  public void setQuality(String paramString) {
    this.quality = paramString;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
}
