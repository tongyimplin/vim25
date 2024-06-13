package com.vmware.vim25;

import com.vmware.vim25.InvalidHostConnectionState;
import com.vmware.vim25.InvalidHostState;
import com.vmware.vim25.InvalidState;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidHostState", propOrder = {"host"})
@XmlSeeAlso({InvalidHostConnectionState.class})
public class InvalidHostState extends InvalidState {
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
