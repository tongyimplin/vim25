package com.vmware.vim25;

import com.vmware.vim25.HostTpmEventDetails;
import com.vmware.vim25.HostTpmSoftwareComponentEventDetails;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmSoftwareComponentEventDetails", propOrder = {"componentName", "vibName", "vibVersion", "vibVendor"})
public class HostTpmSoftwareComponentEventDetails extends HostTpmEventDetails {
  @XmlElement(required = true)
  protected String componentName;
  
  @XmlElement(required = true)
  protected String vibName;
  
  @XmlElement(required = true)
  protected String vibVersion;
  
  @XmlElement(required = true)
  protected String vibVendor;
  
  public String getComponentName() {
    return this.componentName;
  }
  
  public void setComponentName(String paramString) {
    this.componentName = paramString;
  }
  
  public String getVibName() {
    return this.vibName;
  }
  
  public void setVibName(String paramString) {
    this.vibName = paramString;
  }
  
  public String getVibVersion() {
    return this.vibVersion;
  }
  
  public void setVibVersion(String paramString) {
    this.vibVersion = paramString;
  }
  
  public String getVibVendor() {
    return this.vibVendor;
  }
  
  public void setVibVendor(String paramString) {
    this.vibVendor = paramString;
  }
}
