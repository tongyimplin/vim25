package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import com.vmware.vim25.ProfilePropertyPath;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDeferredPolicyOptionParameter", propOrder = {"inputPath", "parameter"})
public class ProfileDeferredPolicyOptionParameter extends DynamicData {
  @XmlElement(required = true)
  protected ProfilePropertyPath inputPath;
  
  protected List<KeyAnyValue> parameter;
  
  public ProfilePropertyPath getInputPath() {
    return this.inputPath;
  }
  
  public void setInputPath(ProfilePropertyPath paramProfilePropertyPath) {
    this.inputPath = paramProfilePropertyPath;
  }
  
  public List<KeyAnyValue> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
