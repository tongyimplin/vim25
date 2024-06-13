package com.vmware.vim25;

import com.vmware.vim25.ArrayOfTaskInfoState;
import com.vmware.vim25.TaskInfoState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaskInfoState", propOrder = {"taskInfoState"})
public class ArrayOfTaskInfoState {
  @XmlElement(name = "TaskInfoState")
  protected List<TaskInfoState> taskInfoState;
  
  public List<TaskInfoState> getTaskInfoState() {
    if (this.taskInfoState == null)
      this.taskInfoState = new ArrayList<>(); 
    return this.taskInfoState;
  }
}
