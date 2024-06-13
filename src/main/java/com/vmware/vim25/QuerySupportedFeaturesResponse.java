package com.vmware.vim25;

import com.vmware.vim25.LicenseFeatureInfo;
import com.vmware.vim25.QuerySupportedFeaturesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QuerySupportedFeaturesResponse")
public class QuerySupportedFeaturesResponse {
  protected List<LicenseFeatureInfo> returnval;
  
  public List<LicenseFeatureInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
