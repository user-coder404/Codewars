function hasUniqueChars(str){
    return new Set(str).size === str.length;
}

module.exports = hasUniqueChars;