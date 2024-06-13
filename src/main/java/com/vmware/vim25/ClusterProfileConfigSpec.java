package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileCompleteConfigSpec;
import com.vmware.vim25.ClusterProfileConfigServiceCreateSpec;
import com.vmware.vim25.ClusterProfileCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileConfigSpec")
@XmlSeeAlso({ClusterProfileCompleteConfigSpec.class, ClusterProfileConfigServiceCreateSpec.class})
public class ClusterProfileConfigSpec extends ClusterProfileCreateSpec {}
