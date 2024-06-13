package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.InstallHostPatchV2RequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallHostPatchV2RequestType", propOrder = {"_this", "metaUrls", "bundleUrls", "vibUrls", "spec"})
public class InstallHostPatchV2RequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> metaUrls;
  
  protected List<String> bundleUrls;
  
  protected List<String> vibUrls;
  
  protected HostPatchManagerPatchManagerOperationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getMetaUrls() {
    if (this.metaUrls == null)
      this.metaUrls = new ArrayList<>(); 
    return this.metaUrls;
  }
  
  public List<String> getBundleUrls() {
    if (this.bundleUrls == null)
      this.bundleUrls = new ArrayList<>(); 
    return this.bundleUrls;
  }
  
  public List<String> getVibUrls() {
    if (this.vibUrls == null)
      this.vibUrls = new ArrayList<>(); 
    return this.vibUrls;
  }
  
  public HostPatchManagerPatchManagerOperationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) {
    this.spec = paramHostPatchManagerPatchManagerOperationSpec;
  }
}
