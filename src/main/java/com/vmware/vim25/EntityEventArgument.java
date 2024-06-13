package com.vmware.vim25;

import com.vmware.vim25.AlarmEventArgument;
import com.vmware.vim25.ComputeResourceEventArgument;
import com.vmware.vim25.DatacenterEventArgument;
import com.vmware.vim25.DatastoreEventArgument;
import com.vmware.vim25.DvsEventArgument;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.EventArgument;
import com.vmware.vim25.FolderEventArgument;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.ManagedEntityEventArgument;
import com.vmware.vim25.NetworkEventArgument;
import com.vmware.vim25.ResourcePoolEventArgument;
import com.vmware.vim25.ScheduledTaskEventArgument;
import com.vmware.vim25.VmEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityEventArgument", propOrder = {"name"})
@XmlSeeAlso({VmEventArgument.class, ComputeResourceEventArgument.class, ManagedEntityEventArgument.class, AlarmEventArgument.class, ResourcePoolEventArgument.class, DatastoreEventArgument.class, HostEventArgument.class, DatacenterEventArgument.class, FolderEventArgument.class, DvsEventArgument.class, ScheduledTaskEventArgument.class, NetworkEventArgument.class})
public class EntityEventArgument extends EventArgument {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
