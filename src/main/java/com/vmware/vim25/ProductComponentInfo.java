package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProductComponentInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductComponentInfo", propOrder = {"id", "name", "version", "release"})
public class ProductComponentInfo extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String version;
  
  protected int release;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public int getRelease() {
    return this.release;
  }
  
  public void setRelease(int paramInt) {
    this.release = paramInt;
  }
}
