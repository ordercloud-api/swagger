<?php
/*
 * ApprovalRule
 */
namespace \Models;

/*
 * ApprovalRule
 */
class ApprovalRule {
    /* @var string $iD  */
    private $iD;
/* @var string $name  */
    private $name;
/* @var string $description  */
    private $description;
/* @var string $approvingGroupID  */
    private $approvingGroupID;
/* @var string $ruleExpression  */
    private $ruleExpression;
/* @var string $scope  */
    private $scope;
/* @var string $scopeTimeUnit  */
    private $scopeTimeUnit;
/* @var int $scopeTimeNumber  */
    private $scopeTimeNumber;
/* @var \DateTime $scopeStartDate  */
    private $scopeStartDate;
/* @var string $expireAfterTimeUnit  */
    private $expireAfterTimeUnit;
/* @var int $expireAfterNumber  */
    private $expireAfterNumber;
/* @var Bool $approveOnExpire  */
    private $approveOnExpire;
/* @var object $xp  */
    private $xp;
}
