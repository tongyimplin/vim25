package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.ProfileDeferredPolicyOptionParameter;
import com.vmware.vim25.ProfileExecuteError;
import com.vmware.vim25.ProfileExecuteResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExecuteResult", propOrder = {"status", "configSpec", "inapplicablePath", "requireInput", "error"})
@XmlSeeAlso({ApplyHostProfileConfigurationSpec.class})
public class ProfileExecuteResult extends DynamicData {
  @XmlElement(required = true)
  protected String status;
  
  protected HostConfigSpec configSpec;
  
  protected List<String> inapplicablePath;
  
  protected List<ProfileDeferredPolicyOptionParameter> requireInput;
  
  protected List<ProfileExecuteError> error;
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public HostConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(HostConfigSpec paramHostConfigSpec) {
    this.configSpec = paramHostConfigSpec;
  }
  
  public List<String> getInapplicablePath() {
    if (this.inapplicablePath == null)
      this.inapplicablePath = new ArrayList<>(); 
    return this.inapplicablePath;
  }
  
  public List<ProfileDeferredPolicyOptionParameter> getRequireInput() {
    if (this.requireInput == null)
      this.requireInput = new ArrayList<>(); 
    return this.requireInput;
  }
  
  public List<ProfileExecuteError> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
}
