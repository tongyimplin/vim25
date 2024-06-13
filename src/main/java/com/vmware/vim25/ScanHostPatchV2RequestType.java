package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ScanHostPatchV2RequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanHostPatchV2RequestType", propOrder = {"_this", "metaUrls", "bundleUrls", "spec"})
public class ScanHostPatchV2RequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> metaUrls;
  
  protected List<String> bundleUrls;
  
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
  
  public HostPatchManagerPatchManagerOperationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) {
    this.spec = paramHostPatchManagerPatchManagerOperationSpec;
  }
}
