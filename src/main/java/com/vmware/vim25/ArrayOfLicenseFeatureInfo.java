package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLicenseFeatureInfo;
import com.vmware.vim25.LicenseFeatureInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseFeatureInfo", propOrder = {"licenseFeatureInfo"})
public class ArrayOfLicenseFeatureInfo {
  @XmlElement(name = "LicenseFeatureInfo")
  protected List<LicenseFeatureInfo> licenseFeatureInfo;
  
  public List<LicenseFeatureInfo> getLicenseFeatureInfo() {
    if (this.licenseFeatureInfo == null)
      this.licenseFeatureInfo = new ArrayList<>(); 
    return this.licenseFeatureInfo;
  }
}
