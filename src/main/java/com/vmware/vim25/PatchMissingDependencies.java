package com.vmware.vim25;

import com.vmware.vim25.PatchMissingDependencies;
import com.vmware.vim25.PatchNotApplicable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchMissingDependencies", propOrder = {"prerequisitePatch", "prerequisiteLib"})
public class PatchMissingDependencies extends PatchNotApplicable {
  protected List<String> prerequisitePatch;
  
  protected List<String> prerequisiteLib;
  
  public List<String> getPrerequisitePatch() {
    if (this.prerequisitePatch == null)
      this.prerequisitePatch = new ArrayList<>(); 
    return this.prerequisitePatch;
  }
  
  public List<String> getPrerequisiteLib() {
    if (this.prerequisiteLib == null)
      this.prerequisiteLib = new ArrayList<>(); 
    return this.prerequisiteLib;
  }
}
