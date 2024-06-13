package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileConfigSpec;
import com.vmware.vim25.ProfileCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileCreateSpec")
@XmlSeeAlso({ClusterProfileConfigSpec.class})
public class ClusterProfileCreateSpec extends ProfileCreateSpec {}
