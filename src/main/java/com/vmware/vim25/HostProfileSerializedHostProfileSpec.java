package com.vmware.vim25;

import com.vmware.vim25.HostProfileSerializedHostProfileSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileSerializedCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileSerializedHostProfileSpec", propOrder = {"validatorHost", "validating"})
public class HostProfileSerializedHostProfileSpec extends ProfileSerializedCreateSpec {
  protected ManagedObjectReference validatorHost;
  
  protected Boolean validating;
  
  public ManagedObjectReference getValidatorHost() {
    return this.validatorHost;
  }
  
  public void setValidatorHost(ManagedObjectReference paramManagedObjectReference) {
    this.validatorHost = paramManagedObjectReference;
  }
  
  public Boolean isValidating() {
    return this.validating;
  }
  
  public void setValidating(Boolean paramBoolean) {
    this.validating = paramBoolean;
  }
}
