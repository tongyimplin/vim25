package com.vmware.vim25;

import com.vmware.vim25.InvalidNetworkInType;
import com.vmware.vim25.InvalidPropertyType;
import com.vmware.vim25.InvalidPropertyValue;
import com.vmware.vim25.MissingIpPool;
import com.vmware.vim25.MissingNetworkIpConfig;
import com.vmware.vim25.NoAvailableIp;
import com.vmware.vim25.NoVcManagedIpConfigured;
import com.vmware.vim25.NotUserConfigurableProperty;
import com.vmware.vim25.VAppPropertyFault;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppPropertyFault", propOrder = {"id", "category", "label", "type", "value"})
@XmlSeeAlso({InvalidNetworkInType.class, MissingNetworkIpConfig.class, NoVcManagedIpConfigured.class, MissingIpPool.class, InvalidPropertyValue.class, NotUserConfigurableProperty.class, NoAvailableIp.class, InvalidPropertyType.class})
public class VAppPropertyFault extends VmConfigFault {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String category;
  
  @XmlElement(required = true)
  protected String label;
  
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String value;
  
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
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
