package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileEvent;
import com.vmware.vim25.ProfileReferenceHostChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileReferenceHostChangedEvent", propOrder = {"referenceHost", "referenceHostName", "prevReferenceHostName"})
public class ProfileReferenceHostChangedEvent extends ProfileEvent {
  protected ManagedObjectReference referenceHost;
  
  protected String referenceHostName;
  
  protected String prevReferenceHostName;
  
  public ManagedObjectReference getReferenceHost() {
    return this.referenceHost;
  }
  
  public void setReferenceHost(ManagedObjectReference paramManagedObjectReference) {
    this.referenceHost = paramManagedObjectReference;
  }
  
  public String getReferenceHostName() {
    return this.referenceHostName;
  }
  
  public void setReferenceHostName(String paramString) {
    this.referenceHostName = paramString;
  }
  
  public String getPrevReferenceHostName() {
    return this.prevReferenceHostName;
  }
  
  public void setPrevReferenceHostName(String paramString) {
    this.prevReferenceHostName = paramString;
  }
}
