package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LicenseManagerEvaluationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseManagerEvaluationInfo", propOrder = {"properties"})
public class LicenseManagerEvaluationInfo extends DynamicData {
  @XmlElement(required = true)
  protected List<KeyAnyValue> properties;
  
  public List<KeyAnyValue> getProperties() {
    if (this.properties == null)
      this.properties = new ArrayList<>(); 
    return this.properties;
  }
}
