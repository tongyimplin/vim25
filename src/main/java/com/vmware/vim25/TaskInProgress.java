package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskInProgress;
import com.vmware.vim25.VAppTaskInProgress;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskInProgress", propOrder = {"task"})
@XmlSeeAlso({VAppTaskInProgress.class})
public class TaskInProgress extends VimFault {
  @XmlElement(required = true)
  protected ManagedObjectReference task;
  
  public ManagedObjectReference getTask() {
    return this.task;
  }
  
  public void setTask(ManagedObjectReference paramManagedObjectReference) {
    this.task = paramManagedObjectReference;
  }
}
