<?php
/*
 * PriceSchedule
 */
namespace \Models;

/*
 * PriceSchedule
 */
class PriceSchedule {
    /* @var string $iD  */
    private $iD;
/* @var string $name  */
    private $name;
/* @var Bool $applyTax  */
    private $applyTax;
/* @var Bool $applyShipping  */
    private $applyShipping;
/* @var int $maxQuantity  */
    private $maxQuantity;
/* @var Bool $useCumulativeQuantity  */
    private $useCumulativeQuantity;
/* @var Bool $restrictedQuantity  */
    private $restrictedQuantity;
/* @var string $orderType  */
    private $orderType;
/* @var \\Models\ShipmentItem[] $priceBreaks  */
    private $priceBreaks;
/* @var object $xp  */
    private $xp;
}
