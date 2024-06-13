package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLicenseSpec;
import com.vmware.vim25.LicenseSource;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLicenseSpec", propOrder = {"source", "editionKey", "disabledFeatureKey", "enabledFeatureKey"})
public class HostLicenseSpec extends DynamicData {
  protected LicenseSource source;
  
  protected String editionKey;
  
  protected List<String> disabledFeatureKey;
  
  protected List<String> enabledFeatureKey;
  
  public LicenseSource getSource() {
    return this.source;
  }
  
  public void setSource(LicenseSource paramLicenseSource) {
    this.source = paramLicenseSource;
  }
  
  public String getEditionKey() {
    return this.editionKey;
  }
  
  public void setEditionKey(String paramString) {
    this.editionKey = paramString;
  }
  
  public List<String> getDisabledFeatureKey() {
    if (this.disabledFeatureKey == null)
      this.disabledFeatureKey = new ArrayList<>(); 
    return this.disabledFeatureKey;
  }
  
  public List<String> getEnabledFeatureKey() {
    if (this.enabledFeatureKey == null)
      this.enabledFeatureKey = new ArrayList<>(); 
    return this.enabledFeatureKey;
  }
}
