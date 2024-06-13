package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseManagerLicenseInfo", propOrder = {"licenseKey", "editionKey", "name", "total", "used", "costUnit", "properties", "labels"})
public class LicenseManagerLicenseInfo extends DynamicData {
  @XmlElement(required = true)
  protected String licenseKey;
  
  @XmlElement(required = true)
  protected String editionKey;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int total;
  
  protected Integer used;
  
  @XmlElement(required = true)
  protected String costUnit;
  
  protected List<KeyAnyValue> properties;
  
  protected List<KeyValue> labels;
  
  public String getLicenseKey() {
    return this.licenseKey;
  }
  
  public void setLicenseKey(String paramString) {
    this.licenseKey = paramString;
  }
  
  public String getEditionKey() {
    return this.editionKey;
  }
  
  public void setEditionKey(String paramString) {
    this.editionKey = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getTotal() {
    return this.total;
  }
  
  public void setTotal(int paramInt) {
    this.total = paramInt;
  }
  
  public Integer getUsed() {
    return this.used;
  }
  
  public void setUsed(Integer paramInteger) {
    this.used = paramInteger;
  }
  
  public String getCostUnit() {
    return this.costUnit;
  }
  
  public void setCostUnit(String paramString) {
    this.costUnit = paramString;
  }
  
  public List<KeyAnyValue> getProperties() {
    if (this.properties == null)
      this.properties = new ArrayList<>(); 
    return this.properties;
  }
  
  public List<KeyValue> getLabels() {
    if (this.labels == null)
      this.labels = new ArrayList<>(); 
    return this.labels;
  }
}
